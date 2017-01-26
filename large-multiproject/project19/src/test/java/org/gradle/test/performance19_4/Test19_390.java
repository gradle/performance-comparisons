package org.gradle.test.performance19_4;

import static org.junit.Assert.*;

public class Test19_390 {
    private final Production19_390 production = new Production19_390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}