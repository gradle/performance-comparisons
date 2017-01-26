package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_347 {
    private final Production91_347 production = new Production91_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}