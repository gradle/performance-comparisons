package org.gradle.test.performance19_4;

import static org.junit.Assert.*;

public class Test19_313 {
    private final Production19_313 production = new Production19_313("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}