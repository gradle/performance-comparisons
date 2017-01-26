package org.gradle.test.performance27_1;

import static org.junit.Assert.*;

public class Test27_45 {
    private final Production27_45 production = new Production27_45("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}