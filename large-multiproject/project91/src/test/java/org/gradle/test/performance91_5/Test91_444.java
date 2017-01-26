package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_444 {
    private final Production91_444 production = new Production91_444("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}