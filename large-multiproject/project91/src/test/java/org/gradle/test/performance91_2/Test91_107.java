package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_107 {
    private final Production91_107 production = new Production91_107("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}