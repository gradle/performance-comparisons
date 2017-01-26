package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_234 {
    private final Production49_234 production = new Production49_234("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}