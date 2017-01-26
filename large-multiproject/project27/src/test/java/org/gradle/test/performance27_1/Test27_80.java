package org.gradle.test.performance27_1;

import static org.junit.Assert.*;

public class Test27_80 {
    private final Production27_80 production = new Production27_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}