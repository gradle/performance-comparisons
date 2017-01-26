package org.gradle.test.performance34_5;

import static org.junit.Assert.*;

public class Test34_427 {
    private final Production34_427 production = new Production34_427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}