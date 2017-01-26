package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_166 {
    private final Production91_166 production = new Production91_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}