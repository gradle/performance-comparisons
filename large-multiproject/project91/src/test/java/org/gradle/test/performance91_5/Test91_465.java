package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_465 {
    private final Production91_465 production = new Production91_465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}