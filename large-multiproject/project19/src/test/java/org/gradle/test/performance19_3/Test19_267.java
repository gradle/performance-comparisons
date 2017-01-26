package org.gradle.test.performance19_3;

import static org.junit.Assert.*;

public class Test19_267 {
    private final Production19_267 production = new Production19_267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}