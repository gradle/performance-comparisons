package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_500 {
    private final Production91_500 production = new Production91_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}