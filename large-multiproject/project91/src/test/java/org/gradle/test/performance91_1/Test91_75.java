package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_75 {
    private final Production91_75 production = new Production91_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}