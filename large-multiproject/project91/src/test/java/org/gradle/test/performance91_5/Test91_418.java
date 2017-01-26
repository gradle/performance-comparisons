package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_418 {
    private final Production91_418 production = new Production91_418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}