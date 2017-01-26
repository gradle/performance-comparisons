package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_45 {
    private final Production91_45 production = new Production91_45("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}