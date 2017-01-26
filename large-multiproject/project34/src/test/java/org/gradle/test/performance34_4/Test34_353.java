package org.gradle.test.performance34_4;

import static org.junit.Assert.*;

public class Test34_353 {
    private final Production34_353 production = new Production34_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}