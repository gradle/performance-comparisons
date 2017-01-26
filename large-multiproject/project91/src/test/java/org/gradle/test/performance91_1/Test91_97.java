package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_97 {
    private final Production91_97 production = new Production91_97("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}