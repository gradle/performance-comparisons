package org.gradle.test.performance34_2;

import static org.junit.Assert.*;

public class Test34_107 {
    private final Production34_107 production = new Production34_107("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}