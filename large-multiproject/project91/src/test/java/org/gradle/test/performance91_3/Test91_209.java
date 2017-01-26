package org.gradle.test.performance91_3;

import static org.junit.Assert.*;

public class Test91_209 {
    private final Production91_209 production = new Production91_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}