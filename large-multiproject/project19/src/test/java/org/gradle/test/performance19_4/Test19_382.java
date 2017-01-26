package org.gradle.test.performance19_4;

import static org.junit.Assert.*;

public class Test19_382 {
    private final Production19_382 production = new Production19_382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}