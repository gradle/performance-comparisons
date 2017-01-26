package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_167 {
    private final Production91_167 production = new Production91_167("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}