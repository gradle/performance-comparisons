package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_100 {
    private final Production91_100 production = new Production91_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}