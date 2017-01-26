package org.gradle.test.performance20_3;

import static org.junit.Assert.*;

public class Test20_234 {
    private final Production20_234 production = new Production20_234("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}