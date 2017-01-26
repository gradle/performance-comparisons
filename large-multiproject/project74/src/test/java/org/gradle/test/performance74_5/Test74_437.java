package org.gradle.test.performance74_5;

import static org.junit.Assert.*;

public class Test74_437 {
    private final Production74_437 production = new Production74_437("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}