package org.gradle.test.performance19_1;

import static org.junit.Assert.*;

public class Test19_100 {
    private final Production19_100 production = new Production19_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}