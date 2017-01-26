package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_495 {
    private final Production91_495 production = new Production91_495("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}