package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_437 {
    private final Production91_437 production = new Production91_437("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}