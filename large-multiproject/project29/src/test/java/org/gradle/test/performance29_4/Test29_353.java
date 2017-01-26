package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_353 {
    private final Production29_353 production = new Production29_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}