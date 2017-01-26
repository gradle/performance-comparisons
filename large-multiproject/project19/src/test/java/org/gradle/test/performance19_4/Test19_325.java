package org.gradle.test.performance19_4;

import static org.junit.Assert.*;

public class Test19_325 {
    private final Production19_325 production = new Production19_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}