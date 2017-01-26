package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_199 {
    private final Production91_199 production = new Production91_199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}