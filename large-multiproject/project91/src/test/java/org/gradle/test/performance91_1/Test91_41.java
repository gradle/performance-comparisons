package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_41 {
    private final Production91_41 production = new Production91_41("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}