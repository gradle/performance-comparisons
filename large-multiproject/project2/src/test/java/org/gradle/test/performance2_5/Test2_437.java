package org.gradle.test.performance2_5;

import static org.junit.Assert.*;

public class Test2_437 {
    private final Production2_437 production = new Production2_437("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}