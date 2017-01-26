package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_77 {
    private final Production91_77 production = new Production91_77("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}