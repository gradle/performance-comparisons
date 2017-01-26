package org.gradle.test.performance27_4;

import static org.junit.Assert.*;

public class Test27_331 {
    private final Production27_331 production = new Production27_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}