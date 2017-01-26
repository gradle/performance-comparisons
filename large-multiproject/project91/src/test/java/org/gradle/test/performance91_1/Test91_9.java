package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_9 {
    private final Production91_9 production = new Production91_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}