package org.gradle.test.performance19_1;

import static org.junit.Assert.*;

public class Test19_91 {
    private final Production19_91 production = new Production19_91("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}