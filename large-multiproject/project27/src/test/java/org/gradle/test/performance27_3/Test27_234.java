package org.gradle.test.performance27_3;

import static org.junit.Assert.*;

public class Test27_234 {
    private final Production27_234 production = new Production27_234("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}