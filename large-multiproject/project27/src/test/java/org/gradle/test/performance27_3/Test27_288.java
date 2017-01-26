package org.gradle.test.performance27_3;

import static org.junit.Assert.*;

public class Test27_288 {
    private final Production27_288 production = new Production27_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}