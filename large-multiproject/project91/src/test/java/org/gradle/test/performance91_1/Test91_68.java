package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_68 {
    private final Production91_68 production = new Production91_68("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}