package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_481 {
    private final Production91_481 production = new Production91_481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}