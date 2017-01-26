package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_432 {
    private final Production91_432 production = new Production91_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}