package org.gradle.test.performance95_4;

import static org.junit.Assert.*;

public class Test95_353 {
    private final Production95_353 production = new Production95_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}