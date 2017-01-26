package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_71 {
    private final Production91_71 production = new Production91_71("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}