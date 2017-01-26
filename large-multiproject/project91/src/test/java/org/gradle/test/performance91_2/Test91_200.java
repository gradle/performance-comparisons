package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_200 {
    private final Production91_200 production = new Production91_200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}