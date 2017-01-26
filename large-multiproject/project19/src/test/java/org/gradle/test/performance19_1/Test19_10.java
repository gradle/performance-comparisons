package org.gradle.test.performance19_1;

import static org.junit.Assert.*;

public class Test19_10 {
    private final Production19_10 production = new Production19_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}