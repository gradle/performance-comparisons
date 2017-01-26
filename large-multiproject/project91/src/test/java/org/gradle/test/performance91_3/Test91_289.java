package org.gradle.test.performance91_3;

import static org.junit.Assert.*;

public class Test91_289 {
    private final Production91_289 production = new Production91_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}