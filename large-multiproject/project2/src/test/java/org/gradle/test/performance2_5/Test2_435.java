package org.gradle.test.performance2_5;

import static org.junit.Assert.*;

public class Test2_435 {
    private final Production2_435 production = new Production2_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}