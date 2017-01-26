package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_172 {
    private final Production91_172 production = new Production91_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}