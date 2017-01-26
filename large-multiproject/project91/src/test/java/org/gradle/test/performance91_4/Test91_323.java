package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_323 {
    private final Production91_323 production = new Production91_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}