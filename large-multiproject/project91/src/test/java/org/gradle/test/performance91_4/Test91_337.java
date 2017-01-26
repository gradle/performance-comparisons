package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_337 {
    private final Production91_337 production = new Production91_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}