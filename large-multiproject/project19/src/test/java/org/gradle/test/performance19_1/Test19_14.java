package org.gradle.test.performance19_1;

import static org.junit.Assert.*;

public class Test19_14 {
    private final Production19_14 production = new Production19_14("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}