package org.gradle.test.performance34_1;

import static org.junit.Assert.*;

public class Test34_100 {
    private final Production34_100 production = new Production34_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}