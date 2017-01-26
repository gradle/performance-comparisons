package org.gradle.test.performance19_4;

import static org.junit.Assert.*;

public class Test19_338 {
    private final Production19_338 production = new Production19_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}