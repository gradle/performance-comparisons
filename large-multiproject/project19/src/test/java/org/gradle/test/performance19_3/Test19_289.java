package org.gradle.test.performance19_3;

import static org.junit.Assert.*;

public class Test19_289 {
    private final Production19_289 production = new Production19_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}