package org.gradle.test.performance27_1;

import static org.junit.Assert.*;

public class Test27_96 {
    private final Production27_96 production = new Production27_96("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}