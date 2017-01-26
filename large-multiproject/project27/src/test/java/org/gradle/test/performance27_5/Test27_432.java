package org.gradle.test.performance27_5;

import static org.junit.Assert.*;

public class Test27_432 {
    private final Production27_432 production = new Production27_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}