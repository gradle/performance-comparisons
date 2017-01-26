package org.gradle.test.performance19_5;

import static org.junit.Assert.*;

public class Test19_497 {
    private final Production19_497 production = new Production19_497("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}